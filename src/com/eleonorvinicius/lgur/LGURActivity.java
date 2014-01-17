package com.eleonorvinicius.lgur;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LGURActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		new MyAsyncTask().execute("https://api.github.com/users/viniciusmayer/repos");
	}

	@Override
	protected void onListItemClick(ListView listView, View view, int position, long id) {
		LGURAdapter lgurAdapter = (LGURAdapter) getListAdapter();
		Repository repository = (Repository) lgurAdapter.getItem(position);
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(repository.getHtml_url())));
	}

	public class MyAsyncTask extends AsyncTask<String, Void, List<Repository>> {

		@Override
		protected List<Repository> doInBackground(String... params) {
			InputStream inputStream = null;
			try {
				inputStream = getInputStream(params);
			} catch (ClientProtocolException e) {
				Log.i("LGUR", e.getMessage(), e);
				return null;
			} catch (IOException e) {
				Log.i("LGUR", e.getMessage(), e);
				return null;
			}
			try {
				return getRepositories(inputStream);
			} catch (JsonParseException e) {
				Log.i("LGUR", e.getMessage(), e);
				return null;
			} catch (IOException e) {
				Log.i("LGUR", e.getMessage(), e);
				return null;
			}
		}

		private List<Repository> getRepositories(InputStream inputStream) throws JsonParseException, IOException {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonFactory jsonFactory = new JsonFactory();
			List<Repository> repositories = new ArrayList<Repository>();
			JsonParser jsonParser = jsonFactory.createParser(inputStream);
			jsonParser.nextToken();
			while (jsonParser.nextToken() == JsonToken.START_OBJECT) {
				Repository repository = objectMapper.readValue(jsonParser, Repository.class);
				repositories.add(repository);
			}
			return repositories;
		}

		private InputStream getInputStream(String... params) throws ClientProtocolException, IOException {
			HttpClient httpClient = new DefaultHttpClient();
			HttpGet httpGet = new HttpGet(params[0]);
			HttpResponse response = httpClient.execute(httpGet);
			return response.getEntity().getContent();
		}

		@Override
		protected void onPostExecute(List<Repository> result) {
			super.onPostExecute(result);
			LGURAdapter lgurAdapter = new LGURAdapter(LGURActivity.this, result);
			LGURActivity.this.setListAdapter(lgurAdapter);
		}
	}
}
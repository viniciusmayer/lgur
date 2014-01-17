package com.eleonorvinicius.lgur;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LGURAdapter extends BaseAdapter {

	private LayoutInflater layoutInflater;
	private ArrayList<Repository> repositories;
//	/private Activity activity;

	public LGURAdapter(LGURActivity lgurActivity, List<Repository> repositories) {
		this.layoutInflater = (LayoutInflater) lgurActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		this.activity = lgurActivity;
		this.repositories = new ArrayList<Repository>(repositories);
	}

	@Override
	public int getCount() {
		return this.repositories.size();
	}

	@Override
	public Object getItem(int position) {
		return this.repositories.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup viewGroup) {
		ViewHolder viewHolder;
		if (view == null) {
			view = layoutInflater.inflate(R.layout.item, null);
			viewHolder = new ViewHolder();
			viewHolder.textView = (TextView) view.findViewById(R.id.textView1);
			view.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.textView.setText(this.repositories.get(position).getName());
		return view;
	}

	class ViewHolder {
		TextView textView;
		ImageView imageView;
		ProgressBar progressBar;
	}
}
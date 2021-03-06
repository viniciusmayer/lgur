package com.eleonorvinicius.lgur;

import java.util.Calendar;

public class Repository {

	private Long id;
	private String name;
	private String full_name;
	private Owner owner;
	private Boolean _private;
	private String html_url;
	private String description;
	private Boolean fork;
	private String url;
	private String forks_url;
	private String keys_url;
	private String collaborators_url;
	private String teams_url;
	private String hooks_url;
	private String issue_events_url;
	private String events_url;
	private String assignees_url;
	private String branches_url;
	private String tags_url;
	private String blobs_url;
	private String git_tags_url;
	private String git_refs_url;
	private String trees_url;
	private String statuses_url;
	private String languages_url;
	private String stargazers_url;
	private String contributors_url;
	private String subscribers_url;
	private String subscription_url;
	private String commits_url;
	private String git_commits_url;
	private String comments_url;
	private String issue_comment_url;
	private String contents_url;
	private String compare_url;
	private String merges_url;
	private String archive_url;
	private String downloads_url;
	private String issues_url;
	private String pulls_url;
	private String milestones_url;
	private String notifications_url;
	private String labels_url;
	private String releases_url;
	private Calendar created_at;
	private Calendar updated_at;
	private Calendar pushed_at;
	private String git_url;
	private String ssh_url;
	private String clone_url;
	private String svn_url;
	private String homepage;
	private Long size;
	private Long stargazers_count;
	private Long watchers_count;
	private String language;
	private Boolean has_issues;
	private Boolean has_downloads;
	private Boolean has_wiki;
	private Long forks_count;
	private String mirror_url;
	private Long open_issues_count;
	private Long forks;
	private Long open_issues;
	private Long watchers;
	private String default_branch;
	private String master_branch;

	public Repository() {
	}

	public Repository(Long id, String name, String full_name, Owner owner, Boolean _private, String html_url, String description, Boolean fork, String url,
			String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url,
			String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url, String git_refs_url, String trees_url,
			String statuses_url, String languages_url, String stargazers_url, String contributors_url, String subscribers_url, String subscription_url,
			String commits_url, String git_commits_url, String comments_url, String issue_comment_url, String contents_url, String compare_url,
			String merges_url, String archive_url, String downloads_url, String issues_url, String pulls_url, String milestones_url, String notifications_url,
			String labels_url, String releases_url, Calendar created_at, Calendar updated_at, Calendar pushed_at, String git_url, String ssh_url,
			String clone_url, String svn_url, String homepage, Long size, Long stargazers_count, Long watchers_count, String language, Boolean has_issues,
			Boolean has_downloads, Boolean has_wiki, Long forks_count, String mirror_url, Long open_issues_count, Long forks, Long open_issues, Long watchers,
			String default_branch, String master_branch) {
		this.id = id;
		this.name = name;
		this.full_name = full_name;
		this.owner = owner;
		this._private = _private;
		this.html_url = html_url;
		this.description = description;
		this.fork = fork;
		this.url = url;
		this.forks_url = forks_url;
		this.keys_url = keys_url;
		this.collaborators_url = collaborators_url;
		this.teams_url = teams_url;
		this.hooks_url = hooks_url;
		this.issue_events_url = issue_events_url;
		this.events_url = events_url;
		this.assignees_url = assignees_url;
		this.branches_url = branches_url;
		this.tags_url = tags_url;
		this.blobs_url = blobs_url;
		this.git_tags_url = git_tags_url;
		this.git_refs_url = git_refs_url;
		this.trees_url = trees_url;
		this.statuses_url = statuses_url;
		this.languages_url = languages_url;
		this.stargazers_url = stargazers_url;
		this.contributors_url = contributors_url;
		this.subscribers_url = subscribers_url;
		this.subscription_url = subscription_url;
		this.commits_url = commits_url;
		this.git_commits_url = git_commits_url;
		this.comments_url = comments_url;
		this.issue_comment_url = issue_comment_url;
		this.contents_url = contents_url;
		this.compare_url = compare_url;
		this.merges_url = merges_url;
		this.archive_url = archive_url;
		this.downloads_url = downloads_url;
		this.issues_url = issues_url;
		this.pulls_url = pulls_url;
		this.milestones_url = milestones_url;
		this.notifications_url = notifications_url;
		this.labels_url = labels_url;
		this.releases_url = releases_url;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.pushed_at = pushed_at;
		this.git_url = git_url;
		this.ssh_url = ssh_url;
		this.clone_url = clone_url;
		this.svn_url = svn_url;
		this.homepage = homepage;
		this.size = size;
		this.stargazers_count = stargazers_count;
		this.watchers_count = watchers_count;
		this.language = language;
		this.has_issues = has_issues;
		this.has_downloads = has_downloads;
		this.has_wiki = has_wiki;
		this.forks_count = forks_count;
		this.mirror_url = mirror_url;
		this.open_issues_count = open_issues_count;
		this.forks = forks;
		this.open_issues = open_issues;
		this.watchers = watchers;
		this.default_branch = default_branch;
		this.master_branch = master_branch;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Boolean getPrivate() {
		return _private;
	}

	public void setPrivate(Boolean _private) {
		this._private = _private;
	}

	public String getHtml_url() {
		return html_url;
	}

	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFork() {
		return fork;
	}

	public void setFork(Boolean fork) {
		this.fork = fork;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getForks_url() {
		return forks_url;
	}

	public void setForks_url(String forks_url) {
		this.forks_url = forks_url;
	}

	public String getKeys_url() {
		return keys_url;
	}

	public void setKeys_url(String keys_url) {
		this.keys_url = keys_url;
	}

	public String getCollaborators_url() {
		return collaborators_url;
	}

	public void setCollaborators_url(String collaborators_url) {
		this.collaborators_url = collaborators_url;
	}

	public String getTeams_url() {
		return teams_url;
	}

	public void setTeams_url(String teams_url) {
		this.teams_url = teams_url;
	}

	public String getHooks_url() {
		return hooks_url;
	}

	public void setHooks_url(String hooks_url) {
		this.hooks_url = hooks_url;
	}

	public String getIssue_events_url() {
		return issue_events_url;
	}

	public void setIssue_events_url(String issue_events_url) {
		this.issue_events_url = issue_events_url;
	}

	public String getEvents_url() {
		return events_url;
	}

	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}

	public String getAssignees_url() {
		return assignees_url;
	}

	public void setAssignees_url(String assignees_url) {
		this.assignees_url = assignees_url;
	}

	public String getBranches_url() {
		return branches_url;
	}

	public void setBranches_url(String branches_url) {
		this.branches_url = branches_url;
	}

	public String getTags_url() {
		return tags_url;
	}

	public void setTags_url(String tags_url) {
		this.tags_url = tags_url;
	}

	public String getBlobs_url() {
		return blobs_url;
	}

	public void setBlobs_url(String blobs_url) {
		this.blobs_url = blobs_url;
	}

	public String getGit_tags_url() {
		return git_tags_url;
	}

	public void setGit_tags_url(String git_tags_url) {
		this.git_tags_url = git_tags_url;
	}

	public String getGit_refs_url() {
		return git_refs_url;
	}

	public void setGit_refs_url(String git_refs_url) {
		this.git_refs_url = git_refs_url;
	}

	public String getTrees_url() {
		return trees_url;
	}

	public void setTrees_url(String trees_url) {
		this.trees_url = trees_url;
	}

	public String getStatuses_url() {
		return statuses_url;
	}

	public void setStatuses_url(String statuses_url) {
		this.statuses_url = statuses_url;
	}

	public String getLanguages_url() {
		return languages_url;
	}

	public void setLanguages_url(String languages_url) {
		this.languages_url = languages_url;
	}

	public String getStargazers_url() {
		return stargazers_url;
	}

	public void setStargazers_url(String stargazers_url) {
		this.stargazers_url = stargazers_url;
	}

	public String getContributors_url() {
		return contributors_url;
	}

	public void setContributors_url(String contributors_url) {
		this.contributors_url = contributors_url;
	}

	public String getSubscribers_url() {
		return subscribers_url;
	}

	public void setSubscribers_url(String subscribers_url) {
		this.subscribers_url = subscribers_url;
	}

	public String getSubscription_url() {
		return subscription_url;
	}

	public void setSubscription_url(String subscription_url) {
		this.subscription_url = subscription_url;
	}

	public String getCommits_url() {
		return commits_url;
	}

	public void setCommits_url(String commits_url) {
		this.commits_url = commits_url;
	}

	public String getGit_commits_url() {
		return git_commits_url;
	}

	public void setGit_commits_url(String git_commits_url) {
		this.git_commits_url = git_commits_url;
	}

	public String getComments_url() {
		return comments_url;
	}

	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}

	public String getIssue_comment_url() {
		return issue_comment_url;
	}

	public void setIssue_comment_url(String issue_comment_url) {
		this.issue_comment_url = issue_comment_url;
	}

	public String getContents_url() {
		return contents_url;
	}

	public void setContents_url(String contents_url) {
		this.contents_url = contents_url;
	}

	public String getCompare_url() {
		return compare_url;
	}

	public void setCompare_url(String compare_url) {
		this.compare_url = compare_url;
	}

	public String getMerges_url() {
		return merges_url;
	}

	public void setMerges_url(String merges_url) {
		this.merges_url = merges_url;
	}

	public String getArchive_url() {
		return archive_url;
	}

	public void setArchive_url(String archive_url) {
		this.archive_url = archive_url;
	}

	public String getDownloads_url() {
		return downloads_url;
	}

	public void setDownloads_url(String downloads_url) {
		this.downloads_url = downloads_url;
	}

	public String getIssues_url() {
		return issues_url;
	}

	public void setIssues_url(String issues_url) {
		this.issues_url = issues_url;
	}

	public String getPulls_url() {
		return pulls_url;
	}

	public void setPulls_url(String pulls_url) {
		this.pulls_url = pulls_url;
	}

	public String getMilestones_url() {
		return milestones_url;
	}

	public void setMilestones_url(String milestones_url) {
		this.milestones_url = milestones_url;
	}

	public String getNotifications_url() {
		return notifications_url;
	}

	public void setNotifications_url(String notifications_url) {
		this.notifications_url = notifications_url;
	}

	public String getLabels_url() {
		return labels_url;
	}

	public void setLabels_url(String labels_url) {
		this.labels_url = labels_url;
	}

	public String getReleases_url() {
		return releases_url;
	}

	public void setReleases_url(String releases_url) {
		this.releases_url = releases_url;
	}

	public Calendar getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Calendar created_at) {
		this.created_at = created_at;
	}

	public Calendar getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Calendar updated_at) {
		this.updated_at = updated_at;
	}

	public Calendar getPushed_at() {
		return pushed_at;
	}

	public void setPushed_at(Calendar pushed_at) {
		this.pushed_at = pushed_at;
	}

	public String getGit_url() {
		return git_url;
	}

	public void setGit_url(String git_url) {
		this.git_url = git_url;
	}

	public String getSsh_url() {
		return ssh_url;
	}

	public void setSsh_url(String ssh_url) {
		this.ssh_url = ssh_url;
	}

	public String getClone_url() {
		return clone_url;
	}

	public void setClone_url(String clone_url) {
		this.clone_url = clone_url;
	}

	public String getSvn_url() {
		return svn_url;
	}

	public void setSvn_url(String svn_url) {
		this.svn_url = svn_url;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Long getStargazers_count() {
		return stargazers_count;
	}

	public void setStargazers_count(Long stargazers_count) {
		this.stargazers_count = stargazers_count;
	}

	public Long getWatchers_count() {
		return watchers_count;
	}

	public void setWatchers_count(Long watchers_count) {
		this.watchers_count = watchers_count;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Boolean getHas_issues() {
		return has_issues;
	}

	public void setHas_issues(Boolean has_issues) {
		this.has_issues = has_issues;
	}

	public Boolean getHas_downloads() {
		return has_downloads;
	}

	public void setHas_downloads(Boolean has_downloads) {
		this.has_downloads = has_downloads;
	}

	public Boolean getHas_wiki() {
		return has_wiki;
	}

	public void setHas_wiki(Boolean has_wiki) {
		this.has_wiki = has_wiki;
	}

	public Long getForks_count() {
		return forks_count;
	}

	public void setForks_count(Long forks_count) {
		this.forks_count = forks_count;
	}

	public String getMirror_url() {
		return mirror_url;
	}

	public void setMirror_url(String mirror_url) {
		this.mirror_url = mirror_url;
	}

	public Long getOpen_issues_count() {
		return open_issues_count;
	}

	public void setOpen_issues_count(Long open_issues_count) {
		this.open_issues_count = open_issues_count;
	}

	public Long getForks() {
		return forks;
	}

	public void setForks(Long forks) {
		this.forks = forks;
	}

	public Long getOpen_issues() {
		return open_issues;
	}

	public void setOpen_issues(Long open_issues) {
		this.open_issues = open_issues;
	}

	public Long getWatchers() {
		return watchers;
	}

	public void setWatchers(Long watchers) {
		this.watchers = watchers;
	}

	public String getDefault_branch() {
		return default_branch;
	}

	public void setDefault_branch(String default_branch) {
		this.default_branch = default_branch;
	}

	public String getMaster_branch() {
		return master_branch;
	}

	public void setMaster_branch(String master_branch) {
		this.master_branch = master_branch;
	}

}

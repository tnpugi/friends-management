package com.tanpugi.fm.resource.response;

import java.util.ArrayList;
import java.util.List;

public class FriendListResponse extends DefaultResponse {

	private List<String> friends = new ArrayList<>();
	
	public List<String> getFriends() {
		return friends;
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public int getCount() {
		return friends.size();
	}
}

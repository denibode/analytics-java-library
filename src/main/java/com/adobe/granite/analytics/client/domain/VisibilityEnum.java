package com.adobe.granite.analytics.client.domain;

import com.google.gson.annotations.SerializedName;

public enum VisibilityEnum {

	@SerializedName("builders")
	BUILDERS,

	@SerializedName("2") // TODO: fix to "builders" as soon as API is fixed
	BUILDERS_BROKEN,

	@SerializedName("hidden")
	HIDDEN,

	@SerializedName("everywhere")
	EVERYWHERE;

}

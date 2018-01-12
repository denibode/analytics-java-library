package com.adobe.granite.analytics.client.domain;

import com.google.gson.annotations.SerializedName;

public enum SerializationEnum {

	@SerializedName("always_record")
	ALWAYS_RECORD,

	@SerializedName("record_once_per_visit")
	RECORD_ONCE_PER_VISIT,

	@SerializedName("record_once_per_unique_id")
	RECORD_ONCE_PER_UNIQUE_ID,

	@SerializedName("unavailable")
    UNAVAILABLE;

}

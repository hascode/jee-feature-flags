package com.hascode.tutorial.fflag.feature;

import org.togglz.core.Feature;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum UserFeatures implements Feature {
	@Label("Displays basic information for a given user")
	DISPLAY_SIMPLE_USER_PROFILE,

	@Label("Displays extended information for a given user")
	DISPLAY_EXTENDED_USER_PROFILE;

	public boolean isActive() {
		return FeatureContext.getFeatureManager().isActive(this);
	}
}

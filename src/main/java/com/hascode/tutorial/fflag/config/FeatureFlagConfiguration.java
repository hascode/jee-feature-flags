package com.hascode.tutorial.fflag.config;

import javax.enterprise.context.ApplicationScoped;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.servlet.user.ServletUserProvider;

import com.hascode.tutorial.fflag.feature.UserFeatures;

@ApplicationScoped
public class FeatureFlagConfiguration implements TogglzConfig {

	private static final String FEATURE_FLAG_ADMIN_ROLE = "feature_flag_admin";

	@Override
	public Class<? extends Feature> getFeatureClass() {
		return UserFeatures.class;
	}

	@Override
	public StateRepository getStateRepository() {
		return new InMemoryStateRepository();
	}

	@Override
	public UserProvider getUserProvider() {
		return new ServletUserProvider(FEATURE_FLAG_ADMIN_ROLE);
	}

}
package com.commit451.gitlab.api;

import com.commit451.gitlab.model.Account;
import com.commit451.gitlab.api.rss.SimpleXmlPersisterFactory;

import org.simpleframework.xml.core.Persister;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Creates RSS instance for GitLab
 */
public class GitLabRssFactory {

    public static GitLabRss create(Account account, OkHttpClient client) {
        Persister persister = SimpleXmlPersisterFactory.createPersister(account);
        Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(account.getServerUrl().toString())
                .client(client)
                .addConverterFactory(SimpleXmlConverterFactory.create(persister))
                .build();
        return restAdapter.create(GitLabRss.class);
    }
}

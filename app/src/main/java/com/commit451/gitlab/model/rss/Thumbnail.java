package com.commit451.gitlab.model.rss;

import org.parceler.Parcel;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import android.net.Uri;

/**
 * Thumbnail
 * Created by John on 10/8/15.
 */
@Parcel
@Root(strict = false)
public class Thumbnail {

    @Attribute(name = "url")
    Uri mUrl;

    public Thumbnail() {}

    public Uri getUrl() {
        return mUrl;
    }
}

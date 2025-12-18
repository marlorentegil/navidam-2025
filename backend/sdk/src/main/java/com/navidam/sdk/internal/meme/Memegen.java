package com.navidam.sdk.internal.meme;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Memegen {
    private final String templateId;
    private final String[] lines;
    private final Map<String, String> query = new LinkedHashMap<>();
    private MemeFormat format = MemeFormat.WEBP;

    private Memegen(String templateId, String... lines) {
        this.templateId = templateId;
        this.lines = lines;
    }

    public static Memegen of(String templateId, String... lines) {
        return new Memegen(templateId, lines);
    }

    public static Memegen ofLines(String templateId, String... lines) {
        return new Memegen(templateId, lines);
    }

    private static String toQueryString(Map<String, String> q) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (var e : q.entrySet()) {
            if (!first) sb.append("&");
            first = false;
            sb.append(URLEncoder.encode(e.getKey(), StandardCharsets.UTF_8));
            sb.append("=");
            sb.append(URLEncoder.encode(e.getValue(), StandardCharsets.UTF_8));
        }
        return sb.toString();
    }

    public Memegen format(MemeFormat f) {
        this.format = f;
        return this;
    }

    public Memegen width(int w) {
        query.put("width", String.valueOf(w));
        return this;
    }

    public Memegen height(int h) {
        query.put("height", String.valueOf(h));
        return this;
    }

    public Memegen font(String fontId) {
        query.put("font", fontId);
        return this;
    }

    public Memegen layout(String layout) {
        query.put("layout", layout);
        return this;
    }

    public Memegen style(String style) {
        query.put("style", style);
        return this;
    }

    public Memegen background(String url) {
        query.put("background", url);
        return this;
    }

    public String url() {
        StringBuilder path = new StringBuilder("https://api.memegen.link/images/")
                .append(templateId);

        for (String l : lines) {
            path.append("/").append(MemegenText.line(l));
        }

        path.append(".").append(format.ext());

        if (query.isEmpty()) return path.toString();

        return path.append("?").append(toQueryString(query)).toString();
    }
}
package com.ringosham.objects;

public class Settings {

    private boolean convertOgg;
    private boolean filterPractice;
    private boolean applyTags;
    private boolean overrideTags;
    private boolean fixEncoding;
    private boolean renameAsBeatmap;
    private boolean filterDuplicates;
    private int filterSeconds;


    public Settings(boolean convertOgg, boolean filterPractice, boolean applyTags, boolean overrideTags, boolean fixEncoding, boolean renameAsBeatmap, boolean filterDuplicates, int filterSeconds) {
        this.convertOgg = convertOgg;
        this.filterPractice = filterPractice;
        this.applyTags = applyTags;
        this.overrideTags = overrideTags;
        this.fixEncoding = fixEncoding;
        this.renameAsBeatmap = renameAsBeatmap;
        this.filterDuplicates = filterDuplicates;
        this.filterSeconds = filterSeconds;
    }

    public boolean isConvertOgg() {
        return convertOgg;
    }

    public boolean isFilterPractice() {
        return filterPractice;
    }

    public boolean isApplyTags() {
        return applyTags;
    }

    public boolean isOverrideTags() {
        return overrideTags;
    }

    public boolean isFixEncoding() {
        return fixEncoding;
    }

    public boolean isRenameAsBeatmap() {
        return renameAsBeatmap;
    }

    public boolean isFilterDuplicates() {
        return filterDuplicates;
    }

    public int getFilterSeconds() {
        return filterSeconds;
    }
}

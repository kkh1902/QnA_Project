package com.qanda.questionboard.tag.domain;

import lombok.Getter;

import java.util.List;

@Getter
public class Tags {

    private static final int MAX_TAGS_SIZE = 5;

    private final List<Tag> tags;

    public Tags(List<Tag> tags) {
//        validateDuplicateTag(tags);
//        validateLength(tags);
        this.tags = tags;
    }
//
//    public static Tags from(List<String> tags) {
//        return new Tags(tags.stream()
//                .map(Tag::new)
//                .collect(Collectors.toList()));
//    }
//
//    private void validateDuplicateTag(List<Tag> tags) {
//        long tagCount = tags.stream()
//                .map(Tag::getName)
//                .distinct()
//                .count();
//
//        if (tagCount != tags.size()) {
//            throw new DuplicateTagException();
//        }
//    }
//
//    private void validateLength(List<Tag> tags) {
//        if (tags.size() > MAX_TAGS_SIZE) {
//            throw new ExceededTagSizeException();
//        }
//    }
//
//    public List<Long> getTagIds() {
//        return tags.stream()
//                .map(Tag::getId)
//                .collect(Collectors.toList());
//    }
//
//    public List<String> getTagNames() {
//        return tags.stream()
//                .map(Tag::getName)
//                .collect(Collectors.toList());
//    }
}

package pl.paniodprogramowania;

import lombok.Builder;

@Builder
public record Lesson (int lessonGroupId, int lessonId) {
}

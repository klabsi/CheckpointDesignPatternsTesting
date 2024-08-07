package pl.paniodprogramowania;

import java.time.Instant;

public record ArticleHomework (String articleToRead, Instant finalDate) implements Homework {
}

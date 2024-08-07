package pl.paniodprogramowania;

import lombok.Builder;

@Builder
public record PersonalData (String name, String surname, String city) {
}

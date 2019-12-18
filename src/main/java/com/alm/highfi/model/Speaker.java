package com.alm.highfi.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"firstName", "lastName"})
@ToString(of = {"firstName", "lastName", "mail", "phone", "birthday"})
public class Speaker {

    @Getter
    @Setter
    String firstName, lastName;

}

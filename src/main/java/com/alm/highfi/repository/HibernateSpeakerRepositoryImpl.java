package com.alm.highfi.repository;

import com.alm.highfi.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Bryan");
        speaker.setLastName("Helsinki");
        speakers.add(speaker);
        return speakers;
    }
}

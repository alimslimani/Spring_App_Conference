package com.alm.highfi.repository;

import com.alm.highfi.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}

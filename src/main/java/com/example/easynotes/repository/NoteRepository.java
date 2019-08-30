package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.easynotes.model.Note;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}

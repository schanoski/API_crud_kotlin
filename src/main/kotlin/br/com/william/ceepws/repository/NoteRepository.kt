package br.com.william.ceepws.repository

import br.com.william.ceepws.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository: CrudRepository<Note, Long>


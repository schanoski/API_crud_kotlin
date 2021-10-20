package br.com.william.ceepws.controller

import br.com.william.ceepws.model.Note
import br.com.william.ceepws.repository.NoteRepository
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.beans.factory.annotation.Autowired


@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository: NoteRepository

    @GetMapping
    fun list(): List<Note> {
        return noteRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody note: Note): Note {
        return noteRepository.save(note)
    }


    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody note: Note): Note {
        if (noteRepository.existsById(id)) {
            val safeNote = note.copy(id)
            return noteRepository.save(safeNote)
        }
        return Note()
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if (noteRepository.existsById(id)) {
            noteRepository.deleteById(id)
        }
    }

}
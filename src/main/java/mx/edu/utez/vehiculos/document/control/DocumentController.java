package mx.edu.utez.vehiculos.document.control;

import mx.edu.utez.vehiculos.document.model.Document;
import mx.edu.utez.vehiculos.utils.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/document")
public class DocumentController {

    private final DocumentService documentService;

    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/all")
    public ResponseEntity<Message> getAllDocument() {
        return documentService.findAll();
    }

    @PostMapping("/save")
    public ResponseEntity<Message> saveDocument(@RequestBody Document document) {
        return documentService.save(document);
    }

    @PutMapping("/update")
    public ResponseEntity<Message> updateDocument(@RequestBody Document document) {
        return documentService.update(document);
    }

}
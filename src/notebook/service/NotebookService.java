package notebook.service;

import java.util.List;

public interface NotebookService {
    List<String> readAll();
    void saveAll(List<String> data);
}

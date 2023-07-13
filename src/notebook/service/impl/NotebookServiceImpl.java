package notebook.service.impl;

import notebook.service.NotebookService;

import java.util.List;

public class NotebookServiceImpl implements NotebookService {
    // private final Operation<String> operation;
    // private Object operation;

    private Operation<String> operation;

    public NotebookServiceImpl(Operation<String> operation) {
        this.operation = operation;
    }

    @Override
    public List<String> readAll() {
        return operation.readAll();
    }

    @Override
    public void saveAll(List<String> data) {
        operation.saveAll(data);
    }
}

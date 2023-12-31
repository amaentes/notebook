package notebook;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.repository.GBRepository;
import notebook.repository.impl.FileOperation;
import notebook.repository.impl.UserRepository;
import notebook.view.UserView;

import static notebook.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation();
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run(); 
    }
}

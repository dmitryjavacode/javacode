import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoArray = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        todoArray.add(todo);
        System.out.println("Добавлено дело " + "\"" + todo + "\"");
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (todoArray.size() > index && 0 <= index) {
            todoArray.add(index, todo);
        } else {
            add(todo);
        }

    }

    public void edit(String todo, int index) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (todoArray.size() > index && 0 <= index) {
//            System.out.println("Отладка 1");
            String deal = todoArray.get(index);
//            System.out.println("Отладка 2");
            todoArray.set(index, todo);
//            System.out.println("Отладка 3");
            System.out.println("Дело " + "\"" + deal + "\"" + " заменено на " + "\"" + todo + "\"");
        }

    }


    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (todoArray.size() > index && 0 <= index) {
            todoArray.remove(index);
        } else {
            System.out.println("Дело с таким номером не существует");
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return todoArray;
    }

}
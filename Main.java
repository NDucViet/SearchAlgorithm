package SearchAlgorithm;


import SortNSearch.controller.Library;
import SortNSearch.controller.SortController;
import SortNSearch.model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSizeArray(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArrays(library.createArray(element.getSizeArray()));
        SortController sortController = new SortController(element);
        sortController.run();
    }
}

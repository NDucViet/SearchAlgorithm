package SearchAlgorithm.controller;

import java.util.Scanner;

import SortNSearch.model.Element;
import SortNSearch.view.Menu;

public class SearchController extends Menu {
    Scanner sc = new Scanner(System.in);
    static String[] mc = {"Search", "Exit" };

    protected Library library = new Library();
    protected Argorithm algorithm = new Argorithm();
    protected int[] array;
    protected int size_array;

    public SearchController(Element element) {
        super("programming", mc);
        size_array = element.getSizeArray();
        array = element.getArrays();
    }

    public void execute(int n) {
        switch (n) {
            case 1:
            search();
                break;
            case 2:
            System.exit(0);
                break;
        }
    }

    public void search() {
        final String[] mcSearch = { "Linear Search", "Binary Search", "Exit" };
        class SearchMenu extends Menu<String> {
            public SearchMenu() {
                super("Search Option", mcSearch);
            }

            @Override
            public void execute(int n) {
                algorithm.buddleSort(array);
                switch (n) {
                    case 1:
                        System.out.println("Enter your number to search");
                        int num1 = Integer.parseInt(sc.nextLine());
                        System.out.println(algorithm.linearSearch(array, num1));
                        break;
                    case 2:
                        System.out.println("Enter your number to search");
                        int num = Integer.parseInt(sc.nextLine());
                        System.out.println(algorithm.binarySerach(array, num, 0, array.length - 1));
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        break;
                }
            }

        }
        SearchMenu searchMenu = new SearchMenu();
        searchMenu.run();
    }

   
}

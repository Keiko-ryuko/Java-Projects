package todo;
import java.util.*; 
public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        List tasks = new ArrayList<>(); 
        while (true) { 
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            int choice = sc.nextInt(); 
            sc.nextLine(); 
            switch (choice) { 
                case 1: System.out.print("Enter task: "); tasks.add(sc.nextLine()); 
                break; 
                case 2: System.out.println("Tasks:"); 
                for (int i = 0; i < tasks.size(); i++) 
                System.out.println((i+1) + ". " + tasks.get(i)); 
                break; 
                case 3: System.out.print("Enter task number to remove: "); 
                int index = sc.nextInt(); 
                if (index > 0 && index <= tasks.size()) 
                    tasks.remove(index - 1); 
                break; 
                case 4: return; 
                default: System.out.println("Invalid option."); 
            } 
        } 
    } 
}


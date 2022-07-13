package ss10_list.exercise.arraylist.service.impl;

import ss10_list.exercise.arraylist.model.Student;
import ss10_list.exercise.arraylist.service.IStudentService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StudentService<E> implements IStudentService {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public static List<Object> people = new ArrayList<>();

    static {
        people.add(new Student(1, "Nam"));
        people.add(new Student(2, "Tý"));
        people.add(new Student(3, "Phúc"));
        people.add(new Student(4, "Anh"));
        people.add(new Student(6, "Thuyên"));
    }

    public StudentService() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public StudentService(int capacity) {
        if (capacity > 0) {
            System.out.println("Khởi tạo thành công với kích thước là " + capacity);
            elements = new Object[capacity];
        } else {
            System.out.println("Lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public void add(Object element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }

        if (elements[index] == null) {
            elements[index] = elements;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = elements;
            size++;
        }
    }

    public Object remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index" + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }


    /**
     * Phương thức trả về số lượng phần tử của StudentService
     *
     * @return
     */

    public int size() {
        return size;
    }

    /**
     * Phương thức tạo ra 1 bản sao của StudentService hiện tại
     *
     * @return
     */

    public StudentService<Object> clone() {
        StudentService<Object> eStudentService = new StudentService<>();
        eStudentService.elements = Arrays.copyOf(this.elements, this.size);
        eStudentService.size = this.size;
        return eStudentService;
    }

    /**
     * Phương thức trả về kích thước của StudentService
     *
     * @return
     */

    public int length() {
        return elements.length;
    }

    /**
     * Phương thức lấy index của 1 phần tử
     *
     * @param elements
     * @return
     */

    public int indexOf(Object elements) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(elements)) {
                return i;
            }
        }
        return index;
    }


    /**
     * Phương thức kiểm tra 1 phần tử có trong StudentService hay không ?
     *
     * @param elenments
     * @return
     */

    public boolean contains(Object elenments) {
        return this.indexOf(elenments) >= 0;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc la: " + elements.length);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }



    /**
     * Phương thức trả về kích thước của StudentService
     *
     * @return
     */

    public boolean add(Object e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size] = e;
        size++;
        return true;
    }

    /**
     * Phương thức trả về vị trí index của StudentService
     *
     *
     * @param index
     * @return
     */

    public E get(int index) {
        return (E) elements[index];
    }


    /**
     * Phương thức clear của StudentService
     */
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }

    }

    @Override
    public void findAll() {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i) instanceof Student) {
                System.out.println(people.get(i));
            }
        }

    }
}

package ss10_list.exercise.arraylist.service;

import ss10_list.exercise.arraylist.service.impl.StudentService;

public interface IStudentService {
    void add(Object element, int index);
    Object remove(int index);
    int size();
    StudentService<Object> clone();
    int indexOf(Object elements);
    boolean contains(Object elenments);
    void ensureCapacity(int minCapacity);
    boolean add(Object e);
    Object get(int index);
    void clear();
    void findAll();
}

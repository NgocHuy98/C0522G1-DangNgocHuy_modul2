package ss10_list.exercise.arraylist.model;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    /**
     * Phương thức trả về số lượng phần tử của MyList
     * @return
     */

    public int size(){
        return size;
    }

    /**
     * Phương thức trả về kích thước của MyList
     * @return
     */

    public int length(){
        return  elements.length;
    }

    /**
     * Phương thức trả về vị trí index của MyList
     * @param index
     * @return
     */

    public E get(int index){
        return (E) elements[index];
    }

    /**
     * Phương thức trả về kích thước của MyList
     * @return
     */

    public boolean add(E e){
        if(size==elements.length){
            ensureCapacity(1);
        }
        elements[size]=e;
        size++;
        return true;
    }



    public MyList(int capacity){
        if(capacity>0){
            System.out.println("Khởi tạo thành công với kích thước là "+capacity);
            elements=new Object[capacity];
        }else {
            System.out.println("Lỗi tham số truyền vào");
            throw new IllegalArgumentException("capacity: "+capacity);
        }
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize = this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
            System.out.println("Khoi tao thanh cong voi kich thuoc la: "+elements.length);
        }else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }

}

package ss10_list.practice.practice2.view2;

import ss10_list.practice.practice2.model2.MyList;

public class MyListTest {
    public static class C05{
        private String name;
        private int id;
        public C05() {
        }

        public C05(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        C05 c051 =new C05("huy",2);
        C05 c052 =new C05("huyg",3);
        C05 c053 =new C05("huyág",4);

        MyList<C05> listInteger = new MyList<C05>();
        listInteger.add(c051);
        listInteger.add(c052);
        listInteger.add(c053);

        for(int i=0;i< listInteger.size();i++) {
            C05 c05= (C05) listInteger.elements[i];
            System.out.println(c05.getId()+c05.getName());
        }
//        System.out.println("element 4: "+listInteger.get(0));
//        System.out.println("element 1: "+listInteger.get(1));
//        System.out.println("element 2: "+listInteger.get(2));
    }
}

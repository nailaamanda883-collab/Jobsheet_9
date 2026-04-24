public class StackSurat19 {
    Surat19[] stack;
    int top;
    int size;

    public StackSurat19(int size) {
        this.size = size;
        stack = new Surat19[size];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size -1;
    }

    void push(Surat19 s) {
        if (!isFull()) {
            stack[++top] = s;
            System.out.println("Surat berhasil ditambahkan!");
        } else {
            System.out.println("Stack penuh! Surat tidak bisa ditambahkan.");
        }
    }

    Surat19 pop(){
        if(!isEmpty()) {
            Surat19 s = stack[top--];
            System.out.println("Surat diproses:");
            s.tampil();
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
    }

    Surat19 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    boolean cari(String nama) {
        for (int i=0; i <=top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }

        return false;
    }
}
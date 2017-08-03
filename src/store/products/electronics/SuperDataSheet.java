package store.products.electronics;

public class SuperDataSheet {
    private Ram ram;
    private Processor processor;

    public SuperDataSheet() {
    }

    public SuperDataSheet(Ram ram, Processor processor) {
        this.ram = ram;
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void show() {
        ram.show();
        processor.show();
//        System.out.println("ram " + ram);
//        System.out.println("processor " + processor);
    }
}

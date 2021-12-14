package Solution11_3_1;

 class Box1<T> {
    private T contents;
    public Box1(T contents) {
        this.contents = contents;
    }
    public T getContents() {
        return contents;
    }
    public void setContents(T contents) {
        this.contents = contents;
    }
}

class Repository<T> {
    private java.util.List<T> data = new java.util.ArrayList<>();

    public void add(T item) { data.add(item); }
    public java.util.List<T> getAll() { return data; }
}

public class RepoDemo {
    public static void main(String[] args) {
        Repository<String> repo = new Repository<>();
        repo.add("Hello");
        repo.add("World");
        System.out.println(repo.getAll());
    }
}

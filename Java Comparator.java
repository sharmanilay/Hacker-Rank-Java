class Checker implements Comparator<Player>{
    @Override
    public int compare(Player obj1, Player obj2) {
        if (obj2.score == obj1.score) {
            return obj1.name.compareTo(obj2.name);
        } else {
            return obj2.score - obj1.score;
        }
    }
};

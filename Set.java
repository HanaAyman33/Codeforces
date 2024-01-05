public class Set {
	int[] set;
	int k;
	int e;
	public Set(int k) {
		set = new int[k];
		this.k = k;
		e = -1;
	}
	public void add(int x) {
		if(e<k) {
			e++;
			set[e] = x;
		}
	}
	public int size() {
		return k;
	}
	public int getNum(int index) {
		return set[index];
	}
}

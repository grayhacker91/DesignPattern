package AdaptorPattern.ClassAdaptor;

	public class ClassAdapter extends WildTurkey implements Duck {
		public void quack() {
			this.gobble();
		}
	}

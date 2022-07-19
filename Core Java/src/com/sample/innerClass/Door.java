package com.sample.innerClass;

public class Door {
	private Lock lock;
	
	
	public Lock getLock() {
		return lock;
	}

	public Door() {
		lock = new Lock(true);
	}

	public void shopStatus() {
		if(lock.isLockValue()) {
			System.out.println("Shop is closed");
		}
		else {
			System.out.println("Shop is opened");
		}
	}

	public class Lock {
		private boolean lockValue;

		public Lock(boolean lock) {
			this.lockValue = lock;
		}

		public boolean isLockValue() {
			return lockValue;
		}

		public void setLockValue(boolean lockValue) {
			this.lockValue = lockValue;
		}
		
		
	}
}

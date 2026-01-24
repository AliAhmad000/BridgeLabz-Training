package com.resumeanalyzer;

public class ResumeData {
	 String email;
	 String phone;

	    ResumeData(String email, String phone, int keywordCount,String skills) {
	        this.email = email;
	        this.phone = phone;
	       
	    }

		public ResumeData() {
			
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		@Override
		public String toString() {
			return "ResumeData [email=" + email + ", phone=" + phone + "]";
		}

}

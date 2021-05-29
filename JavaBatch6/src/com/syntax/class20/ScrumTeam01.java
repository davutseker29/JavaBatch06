package com.syntax.class20;

public class ScrumTeam01 extends Emp {

	String ceremonies;

	void attendsMeetings() {

		System.out.println("Scrum teem attends " + ceremonies);
	}

	class ProductOwner extends ScrumTeam01 {

		void prioritizeBacklog() {
			System.out.println("prioritized the backlog");
		}
	}

	class ScrumMaster extends ScrumTeam01 {

		void navigateTeam() {
			System.out.println("Scrum master faciliates Scrum team");
		}
	}

	class Developers extends ScrumTeam01 {

		void coding() {
			System.out.println("write codes");
		}
	}

	class Testers extends ScrumTeam01 {

		void testing() {
			System.out.println("quality of the test");
		}
	}

	class BA extends ScrumTeam01 {

		void workWithRequirments() {
			System.out.println("gets requirmwnts from customers");
		}
	}
	

}

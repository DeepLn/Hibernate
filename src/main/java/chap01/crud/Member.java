package chap01.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// javax.persistence ���� import �մϴ�. ���̺�� ���εǴ�
// �ϰڴٴ� ��!
public class Member {

	@Id
	// ��Ű ����
	@GeneratedValue
	// �ڵ� ���� ����
	private int id;
	private String message;
	private String name;

	// �Ķ���Ͱ� ���� ������ �ʿ�
	public Member() {
	}

	// �׿� ����

	public Member(String name, String message) {
		super();
		this.name = name;
		this.message = message;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getMessage() {

		return message;

	}

	public void setMessage(String message) {
		this.message = message;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", message=" + message + ", name=" + name
				+ "]";
	}

}

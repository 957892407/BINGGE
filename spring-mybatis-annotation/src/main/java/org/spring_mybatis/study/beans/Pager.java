package org.spring_mybatis.study.beans;

import java.util.List;

public class Pager {

	private int page;//��ǰҳ
	private int rows;//ÿҳ��Ҫ��ʾ������
	private int index;//����һ��λ��ȡ����
	
	private int totalRows;
	private int totalPage;
	
	private List<?> datas;//���������

	public Pager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getIndex() {
		index = (page -1) * rows;
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
		totalPage = totalRows % rows == 0 ? (totalRows / rows) : (totalRows / rows + 1);
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<?> getDatas() {
		return datas;
	}

	public void setDatas(List<?> datas) {
		this.datas = datas;
	}

	@Override
	public String toString() {
		return "Pager [page=" + page + ", rows=" + rows + ", index=" + index + ", totalRows=" + totalRows
				+ ", totalPage=" + totalPage + ", datas=" + datas + "]";
	}
}

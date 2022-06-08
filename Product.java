import java.time.LocalDate;

class Product
{
	public int id;
	public String name;
	public int qulity;
	public boolean isDelete;
	public LocalDate saleDate;

	public Product(int id, String name, int qulity, boolean isDelete,LocalDate saleDate)
	{
		super();
		this.id = id;
		this.name = name;
		this.qulity = qulity;
		this.isDelete=isDelete;
		this.saleDate=saleDate;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQulity()
	{
		return qulity;
	}

	public void setQulity(int qulity)
	{
		this.qulity = qulity;
	}


	public boolean isDelete() {
		return isDelete;
	}

	public void setDelete(boolean isDelete) {
		this.isDelete = isDelete;
	}

	public LocalDate getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}

	@Override
	public String toString()
	{
		return "Product [id=" + id + ", name=" + name + ", qulity="
				+ qulity + ", isDelete="+isDelete+", saleDate="+saleDate+"]\n";
	}
}

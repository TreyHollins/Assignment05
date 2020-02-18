/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 2/13/2020
 * Assignment: 05
 * Description:
 * Citations:
 */
package device;

public class Device {
	private String partNumber;
	private String SKU;
	private Boolean OnOrOff;
	
	public Device (String partNumber, String SKU) {
		setPartNumber(partNumber);
		setSKU(SKU);
		this.OnOrOff = false;
	}
	/***
	 * Get the part number
	 * @return part number
	 */
	public String getPartNumber() {
		return partNumber;
	}
	/***
	 * Define the part number
	 * @param partNumber
	 */
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	/***
	 * Get the SKU 
	 * @return SKU
	 */
	public String getSKU() {
		return SKU;
	}
	/***
	 * Define the SKU
	 * @param sKU
	 */
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	/***
	 * Get on or off
	 * @return OnOrOff true = on false = off
	 */
	public Boolean getOnOrOff() {
		return OnOrOff;
	}
	/***
	 * Define whether the device is on or off
	 * @param onOrOff 
	 */
	public void setOnOrOff(Boolean onOrOff) {
		OnOrOff = onOrOff;
	}
	public String toString() {
		return "Part Number: " + partNumber + ", SKU: " + SKU + ", On OR Off: " + OnOrOff;
	}
}

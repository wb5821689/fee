package com.landray.kmss.fs;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 凭证管理
 * 
 * @author wangbing
 * @data 2015-6-26
 */
public class TestOfU8 {

	public static void main(String args[]) {
		try {
			URL url = new URL("http://192.168.1.77/U8EAI/import.asp");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(3000000);
			con.setReadTimeout(3000000);
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setAllowUserInteraction(false);
			con.setUseCaches(false);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-type",
					"application/x-www-form-urlencoded");
			// 发送Request消息
			OutputStream out = con.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			//<!--项目档案roottag:类型 billtype:系统用 docid:唯一编号 receiver:接收方 sender:发送方编码 proc:操作码 codeexchanged:编码是否转换 exportneedexch导出时是否要根据对照表替换-->
			String requestXml ="<?xml version=\"1.0\" encoding=\"utf-8\"?><ufinterface roottag=\"fitem\" docid=\"\" proc=\"query\" billtype=\"\" receiver=\"u8\" sender=\"003\" codeexchanged=\"\" exportneedexch=\"n\">"
					+"<fitem citem_class=\"\" citem_name=\"\" citem_text=\"\" crule=\"\">"
					+" <structure>"
					+"   <field citem_sqr=\"\" cfield_name=\"\" ctext=\"\" imode=\"\" itype=\"\" ilength=\"\" iscale=\"\" blist=\"\" bsum=\"\" bref=\"\" isubitem=\"\" idefine=\"\" bprimarykey=\"\" isource=\"\" ctablename=\"\" cfieldname=\"\" iwidth=\"\" ialign=\"\" />"
					+" </structure>"
					+"   <itemclass citemccode=\"\" citemcname=\"\" iitemcgrade=\"\" bitemcend=\"\">"
					+"  </itemclass>"
					+" </fitem>"
					+"</ufinterface>";
			
			
			
//			String requestXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><ufinterface roottag=\"voucher\" billtype=\"\" docid=\"\" receiver=\"u8\" sender=\"cs001\" proc=\"query\" codeexchanged=\"n\" exportneedexch=\"n\" version=\"2.0\">"
//					+"<voucher><field display='备注1' name='ccode' operation='=' value='1001'/></voucher>"
//				String requestXml="<?xml version=\'1.0\' encoding=\'utf-8\'?>"
//			+ "<ufinterface roottag=\'voucher\' billtype=\'\' docid=\'\' receiver=\'u8\' sender=\'cs001\'"
//			+ " proc=\'add\' codeexchanged=\'N\' renewproofno=\'Y\' exportneedexch=\'N\' timestamp=\'\'"
//			+ " lastquerydate=\'\'>"
//					+"<voucher >" 
//					    +"<voucher_head>" 
//					      +"<company/>"  
//					      +"<voucher_type>记</voucher_type>"  
//					      +"<fiscal_year>2016</fiscal_year>"  
//					      +"<accounting_period>06</accounting_period>"  
//					      +"<voucher_id></voucher_id>"  
//					      +"<attachment_number>5</attachment_number>"  
//					      +"<date>2015-6-29</date>"  
//					      +"<auditdate/>"  
//					      +"<enter>CFO</enter>"  
//					      +"<cashier/>"  
//					      +"<signature/>"  
//					      +"<checker/>"  
//					      +"<posting_date/>"  
//					      +"<posting_person/>"  
//					      +"<voucher_making_system/>"  
//					      +"<memo1/>"  
//					      +"<memo2/>"  
//					      +"<reserve1/>"  
//					      +"<reserve2></reserve2>"  
//					      +"<revokeflag/>" 
//					    +"</voucher_head>"  
//					    +"<voucher_body>" 
//					      +"<entry>" 
//					        +"<entry_id>1</entry_id>"  
//					        +"<account_code>1211</account_code>"  
//					        +"<abstract>ww</abstract>"  
//					        +"<settlement/>"  
//					        +"<document_id/>"  
//					        +"<document_date/>"  
//					        +"<currency/>"  
//					        +"<unit_price/>"  
//					        +"<exchange_rate1/>"  
//					        +"<exchange_rate2></exchange_rate2>"  
//					        +"<debit_quantity></debit_quantity>"  
//					        +"<primary_debit_amount></primary_debit_amount>"  
//					        +"<secondary_debit_amount/>"  
//					        +"<natural_debit_currency>500</natural_debit_currency>"  
//					        +"<credit_quantity></credit_quantity>"  
//					        +"<primary_credit_amount></primary_credit_amount>"  
//					        +"<secondary_credit_amount/>"  
//					        +"<natural_credit_currency></natural_credit_currency>"  
//					        +"<bill_type/>"  
//					        +"<bill_id/>"  
//					        +"<bill_date/>"  
//					        +"<auxiliary_accounting>" 
//					          +"<item name=\"dept_id\"/>"  
//					          +"<item name=\"personnel_id\"/>"  
//					          +"<item name=\"cust_id\"/>"  
//					          +"<item name=\"supplier_id\"/>"  
//					          +"<item name=\"item_id\"/>"  
//					          +"<item name=\"item_class\"/>"  
//					          +"<item name=\"operator\"/>"  
//					          +"<item name=\"self_define1\"/>"  
//					          +"<item name=\"self_define2\"/>"  
//					          +"<item name=\"self_define3\"/>"  
//					          +"<item name=\"self_define4\"/>"  
//					          +"<item name=\"self_define5\"/>"  
//					          +"<item name=\"self_define6\"/>"  
//					          +"<item name=\"self_define7\"/>"  
//					          +"<item name=\"self_define8\"/>"  
//					          +"<item name=\"self_define9\"/>"  
//					          +"<item name=\"self_define10\"/>"  
//					          +"<item name=\"self_define11\"/>"  
//					          +"<item name=\"self_define12\"/>"  
//					          +"<item name=\"self_define13\"/>"  
//					          +"<item name=\"self_define14\"/>"  
//					          +"<item name=\"self_define15\"/>"  
//					          +"<item name=\"self_define16\"/>" 
//					        +"</auxiliary_accounting>"  
//					        +"<detail>" 
//					          +"<cash_flow_statement>"+"</cash_flow_statement>"  
//					          +"<code_remark_statement>"+"</code_remark_statement>" 
//					        +"</detail>" 
//					      +"</entry>"  
//					      +"<entry>" 
//					        +"<entry_id>2</entry_id>"  
//					        +"<account_code>1632</account_code>"  
//					        +"<abstract>15</abstract>"  
//					        +"<settlement/>"  
//					        +"<document_id/>"  
//					        +"<document_date/>"  
//					        +"<currency/>"  
//					        +"<unit_price/>"  
//					        +"<exchange_rate1/>"  
//					        +"<exchange_rate2></exchange_rate2>"  
//					        +"<debit_quantity></debit_quantity>"  
//					        +"<primary_debit_amount></primary_debit_amount>"  
//					        +"<secondary_debit_amount/>"  
//					        +"<natural_debit_currency></natural_debit_currency>"  
//					        +"<credit_quantity></credit_quantity>"  
//					        +"<primary_credit_amount></primary_credit_amount>"  
//					        +"<secondary_credit_amount/>"  
//					        +"<natural_credit_currency>500</natural_credit_currency>"  
//					        +"<bill_type/>"  
//					        +"<bill_id/>"  
//					        +"<bill_date/>"  
//					        +"<auxiliary_accounting>" 
//					          +"<item name=\"dept_id\"/>"  
//					          +"<item name=\"personnel_id\"/>"  
//					          +"<item name=\"cust_id\"/>"  
//					          +"<item name=\"supplier_id\"/>"  
//					          +"<item name=\"item_id\"/>"  
//					          +"<item name=\"item_class\"/>"  
//					          +"<item name=\"operator\"/>"  
//					          +"<item name=\"self_define1\"/>"  
//					          +"<item name=\"self_define2\"/>"  
//					          +"<item name=\"self_define3\"/>"  
//					          +"<item name=\"self_define4\"/>"  
//					          +"<item name=\"self_define5\"/>"  
//					          +"<item name=\"self_define6\"/>"  
//					          +"<item name=\"self_define7\"/>"  
//					          +"<item name=\"self_define8\"/>"  
//					          +"<item name=\"self_define9\"/>"  
//					          +"<item name=\"self_define10\"/>"  
//					          +"<item name=\"self_define11\"/>"  
//					          +"<item name=\"self_define12\"/>"  
//					          +"<item name=\"self_define13\"/>"  
//					          +"<item name=\"self_define14\"/>"  
//					          +"<item name=\"self_define15\"/>"  
//					          +"<item name=\"self_define16\"/>" 
//					        +"</auxiliary_accounting>"  
//					        +"<detail>" 
//					          +"<cash_flow_statement>"+"</cash_flow_statement>"  
//					          +"<code_remark_statement>"+"</code_remark_statement>" 
//					        +"</detail>" 
//					      +"</entry>" 
//					    +"</voucher_body>" 
//					  +"</voucher>"

//					+"</ufinterface>";
			dos.write(requestXml.getBytes("UTF-8"));
			System.out.println("请求:" + requestXml);
			// 获取Response消息
			InputStream in = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in,
					"UTF-8"));
			StringBuilder sb = new StringBuilder();
			String s = null;
			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			String responseXml = sb.toString();
			System.out.println("响应:" + responseXml);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}

package com.test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class db {

	static List list =new ArrayList();
	static int count=0;
	static{

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
//	 list.add("SELECT * FROM `shopnc_member` member WHERE ( member_id = '65450' ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_admin` admin WHERE ( member_id = '65450' ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_seller` AS `seller` LEFT JOIN `shopnc_seller_store_relation` AS `seller_store_relation` ON seller.seller_id=seller_store_relation.seller_id WHERE ( seller.member_id = '65450' ) LIMIT 1000");
//	 list.add("SELECT * FROM `shopnc_mail_cron` mail_cron ORDER BY mail_id asc LIMIT 50");
//	 list.add("SELECT * FROM `shopnc_orders` orders WHERE ( orders.add_time <= '1542158041' ) AND ( orders.order_state = '10' ) AND ( orders.has_miaosha = '1' ) LIMIT 10001");
//	 list.add("SELECT * FROM `shopnc_p_xianshi_goods` p_xianshi_goods WHERE ( state = '1' ) AND ( start_time < '1542159841' ) AND ( end_time > '1542159841' ) AND ( goods_id IN ('567852','472723','458810','458806','458795','458481','458475','458452','458436','458413','457853','457850','456816','456734','454964','454958','453738','452248','451723','451718','451650','450901','450389','448680','447655','446719','440712','438607','435985','435106','434891','433925','433161','431949','430569','430466','430455','429628','429598','429553','428947','428334','428318','427753','427672','426117','426116','426088','426085','425155','425067','419696','418289','418011','417321','416269','414810','414800','414272','414185','411861','410959','410772','410732','410239','409779','408726','408720','408698','408496','408482','408464','408097','407257','406144','401460','400057','398424','396389','395316','392549','392394','389779','389775','388202','388029','386813','384088','380802','379556','379518','379501','379319','377450','373967','373966','373961','373960','371219','367477','366768','366540','366364','364558','363790','362649','362331','362253','362247','361779','359549','356982','353734','353533','352839','352838','352829','352827','352823','352764','348345','344863','344541','344540','340942','340559','338963','338838','336663','335985','335729','335511','335508','335426','335164','334986','334915','334874','332915','331668','331667','331547','331533','331324','327177','326900','326686','326057','325374','324630','324610','321760','317520','317416','317396','317395','310575','309380','309256','309186','308931','306261','306056','304258','302825','300896','300801','299492','299259','299046','297245','296773','295060','291531','291470','290490','290467','290466','290464','290463','290459','289693','289331','289298','289283','289230','289226','289225','289223','289215','289214','289213','289212','289211','289201','286515','286513','286502','286264','286089','284918','284892','284890','284880','284089','284039','284009','283268','280106','280066','279412','279411','278919','278549','277468','277451','276074','276069','276050','276044','276042','276023','275919','275319','275142','275141','275137','275113','275082','275076','275052','267254','264328','264312','264310','264308','264307','262686','261653','261652','261646','261630','261107','260873','260834','260826','260491','259939','259876','258560','258545','258540','257347','257346','257345','257341','256947','256611','255930','255916','255515','254922','253282','252643','252249','251721','251635','251177','250358','249836','249825','249788','249722','249720','249719','249718','249717','249716','249715','249714','249713','249712','249711','249708','249707','249706','249705','249704','249658','249643','249508','249507','249505','249503','249501','249499','249483','249389','249212','249190','247724','247666','247656','247296','247178','247144','247137','246887','246679','246606','245982','244844','243838','243700','242302','242255','242158','241921','241894','241647','241499','240667','240665','240578','240400','240360','240338','240261','240165','239875','239687','239399','238894','238682','238678','237860','237401','237009','236751','236746','236740','236727','236720','235791','235789','234741','234659','233490','233033','233021','232970','231694','231680','231648','231525','230369','230359','230099','229941','227331','227330','227319','227277','227275','226547','226356','226309','226130','226129','225578','225530','225272','225220','222969','222914','222901','222250','222199','222190','222138','221485','221410','220948','220818','220589','220588','220565','220482','220472','220471','220399','220334','220252','220188','219887','219266','219261','219239','219073','218542','218541','218482','218448','218441','218437','218012','217988','217978','217972','217851','217793','217779','217399','216874','216435','216399','216330','216002','213508','213507','213506','213505','213503','213499','213498','213497','213490','213487','213458','213447','213442','213441','213436','213413','213408','212669','210961','210490','210487','210486','210476','210469','210466','210452','209867','209861','209860','209854','209351','209215','209006','208992','208867','208700','208442','207646','207634','207631','207419','207418','207405','207198','206569','206252','205010','204961','204955','204237','204172','203871','203500','203497','203496','203492','201395','201245','200879','200840','200735','199504','199305','199251','198900','198857','198781','198770','198330','198323','198321','198309','198308','198305','198304','198303','198258','198250','198238','198224','197581','197328','197327','197079','196892','196825','196255','195878','195874','195041','194810','194462','194461','194447','193950','193947','193853','193583','193558','193376','193154','193094','193091','192675','192608','192603','192104','192078','191856','191855','191306','191295','191291','191288','191279','191269','191106','190935','190934','190901','190899','190897','190889','190886','190868','190862','190859','190730','189389','189195','189194','189193','187875','187781','187775','187766','187530','187481','187473','187463','186338','186337','186334','186332','186329','186322','186320','186317','186313','186310','186292','184969','184550','183987','183835','183828','183796','183778','182862','182574','182472','182004','177266','175931','175819','175807','175806','175550','175548','175547','175546','175039','174884','174883','174877','174875','174852','174851','174822','174821','174816','174815','174658','173953','173951','173709','170128','169876','169875','169874','169873','169871','169868','169867','169568','169566','169547','169525','168558','166006','161914','161581','157464','157370','156282','155545','155474','153545','153540','152327','150098','145893','130851','130829','130790','118359','118192','118154','118151','117835','116540','116170','116150','116147','116117','116069','116057','115936','115931','115749','115736','115705','115701','115210','115209','115208','114823','114671','113815','113802','113795','113792','113785','113604','113362','113355','113333','113242','112747','111876','111664','109122','108938','108920','108831','108761','108706','108056','108045','108044','108017','108016','107997','107823','107266') ) ORDER BY xianshi_goods_id desc LIMIT 1000");
//	 list.add("SELECT ct_auditstate,ct_joinstate FROM `shopnc_contract` contract WHERE ( ct_storeid = '19' ) AND ( ct_itemid = '2' ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_pf_refund_return` pf_refund_return WHERE ( order_id = '473144' ) LIMIT 1");
//	 list.add("SELECT is_receive FROM `shopnc_member_msg_setting` member_msg_setting WHERE ( mmt_code = 'order_deliver_success' ) AND ( member_id = '50411' ) LIMIT 1");
//	 list.add("SELECT count(DISTINCT t_id) as count FROM `shopnc_chat_msg` chat_msg WHERE ( f_id = '136765' ) AND ( add_time >= '1539532800' ) LIMIT 1 ");
//	 list.add("SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.store_id = '83274' ) AND ( qdt_type = '0' ) AND ( is_groupon = '0' ) AND ( order_type = '3' ) AND ( delete_state = '0' ) ORDER BY order_id desc LIMIT 0,20");
//	 //list.add("SELECT COUNT(*) AS nc_count FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.is_groupon = '0' ) AND ( pf_orders.change_order_id > '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) LIMIT 1");
//	 list.add("SELECT buyer_id,store_id FROM `shopnc_pf_orders` pf_orders WHERE ( order_id = '473171' ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_send_message` send_message WHERE (send_date BETWEEN 1541520000 AND 1542211199) AND FIND_IN_SET(17, vr_city_id) LIMIT 1000");
//	 list.add("SELECT * FROM `shopnc_seller` AS `seller` LEFT JOIN `shopnc_seller_store_relation` AS `seller_store_relation` ON seller.seller_id=seller_store_relation.seller_id WHERE ( seller.member_id = '3478' ) LIMIT 1000");
//	 list.add("SELECT goods_id,goods_num,pf_orders.order_id as order_id FROM `shopnc_pf_order_goods` AS `pf_order_goods` INNER JOIN `shopnc_pf_orders` AS `pf_orders` ON pf_order_goods.order_id=pf_orders.order_id WHERE ( pf_orders.order_id = '473171' ) AND ( is_star = '1' ) ORDER BY rec_id desc LIMIT 1000");
//	 list.add("SELECT COUNT(*) AS nc_count FROM `shopnc_goods_common` goods_common WHERE ( store_id = '83274' ) AND ( goods_state = '1' ) AND ( goods_verify = '1' ) LIMIT 1");
//	 list.add("SELECT count(DISTINCT t_id) as count FROM `shopnc_chat_msg` chat_msg WHERE ( f_id = '136765' ) AND ( add_time >= '1539532800' ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_seller` AS `seller` LEFT JOIN `shopnc_seller_store_relation` AS `seller_store_relation` ON seller.seller_id=seller_store_relation.seller_id WHERE ( seller.member_id = '65450' ) LIMIT 1000");
//	 list.add("SELECT * FROM `shopnc_ttg_pay` ttg_pay WHERE ( addtime > '1542158046' ) AND ( status = '0' ) LIMIT 1000");
//	 list.add("SELECT * FROM `shopnc_orders` orders WHERE ( orders.add_time <= '1542158041' ) AND ( orders.order_state = '10' ) AND ( orders.has_miaosha = '1' ) LIMIT 1000");



		list.add("SELECT * FROM `shopnc_goods` WHERE shopnc_goods.store_id < 78807 and shopnc_goods.store_id > 68918 AND goods_storage > floor(rand()*30+50) LIMIT 500");
		list.add("SELECT chain.chain_id,store.store_id,store.store_name,chain.chain_img FROM `shopnc_store` AS `store` INNER JOIN `shopnc_chain` AS `chain` ON store.chain_id=chain.chain_id WHERE ( chain.chain_id IN ('2044','63617','34366','86603','149','54682','77540','34181','64644','1463','34588','1749','81360','34675','34971','75746','2030','81288','64897','82409','2027','63453','54744','3148','86868','893','33954','1457','63019','13','33558','2059','30024','54774') ) AND ( store.store_state = '1' ) LIMIT 0,6");
		list.add("SELECT COUNT(*) AS nc_count FROM `shopnc_goods` goods WHERE ( goods_id IN ('730679','732402','733346','733045','638515','734672','677734','617016','664961','669825','701820','766733','705796','688304','624414','679663','767243','766720') ) LIMIT 1");
		list.add("SELECT goods_id FROM `shopnc_goods` goods WHERE goods_id in (760644,719032,719126,603669,603657,603660,603666,603668,603665,603659,603663,603658) and goods_state = 1 and goods_verify = 1 and is_subtract = 1 ");
		list.add("SELECT * FROM `shopnc_vr_area` vr_area WHERE ( city_code LIKE '41%' ) LIMIT 1");
		list.add("SELECT chain_voucher_template.voucher_t_id,voucher_t_store_id,chain_voucher_template.voucher_t_title,voucher_t_desc,voucher_t_start_date,voucher_t_end_date,voucher_t_price,voucher_t_limit,voucher_t_total,voucher_t_giveout,voucher_t_eachlimit,count(chain_voucher.voucher_id) own_num,voucher_t_sku FROM `shopnc_chain_voucher_template` AS `chain_voucher_template` LEFT JOIN `shopnc_chain_voucher` AS `chain_voucher` ON chain_voucher.voucher_t_id = chain_voucher_template.voucher_t_id and chain_voucher.voucher_state !=4 and chain_voucher.voucher_owner_id = 167089 WHERE ( chain_voucher_template.voucher_t_store_id = '3660' ) AND ( chain_voucher_template.voucher_t_state = '1' ) AND ( chain_voucher_template.voucher_t_gettype = '3' ) AND ( chain_voucher_template.voucher_t_start_date <= '1544350572' ) AND ( chain_voucher_template.voucher_t_end_date >= '1544350572' ) GROUP BY chain_voucher_template.voucher_t_id ORDER BY voucher_t_price desc");
		list.add("SELECT chain_voucher_template.voucher_t_id,voucher_t_store_id,chain_voucher_template.voucher_t_title,voucher_t_desc,voucher_t_start_date,voucher_t_end_date,voucher_t_price,voucher_t_limit,voucher_t_total,voucher_t_giveout,voucher_t_eachlimit,count(chain_voucher.voucher_id) own_num,voucher_t_sku FROM `shopnc_chain_voucher_template` AS `chain_voucher_template` LEFT JOIN `shopnc_chain_voucher` AS `chain_voucher` ON chain_voucher.voucher_t_id = chain_voucher_template.voucher_t_id and chain_voucher.voucher_state !=4 and chain_voucher.voucher_owner_id = 167089 WHERE ( chain_voucher_template.voucher_t_store_id = '3660' ) AND ( chain_voucher_template.voucher_t_state = '1' ) AND ( chain_voucher_template.voucher_t_gettype = '3' ) AND ( chain_voucher_template.voucher_t_start_date <= '1544350572' ) AND ( chain_voucher_template.voucher_t_end_date >= '1544350572' ) GROUP BY chain_voucher_template.voucher_t_id ORDER BY voucher_t_price desc");
		list.add("SELECT * FROM `shopnc_adv` adv WHERE ( ap_id = '42' ) AND ( vr_area_id LIKE '%,0,%' ) AND ( adv_end_date > '1544351318' ) ORDER BY slide_sort, adv_id desc LIMIT 1000");


//	 list.add("SELECT * FROM `shopnc_goods` goods WHERE ( goods_id  =  (floor(rand()*514385) + 100020) ) LIMIT 1");
//	 list.add("SELECT * FROM `shopnc_member` where member_id > floor(rand() * 10000) LIMIT 100, 100");
//	 list.add("select pfg.goods_num, pfg.goods_price, pfg.serve_price_info  from shopnc_pf_orders  pf  left join  shopnc_pf_order_goods pfg  on pf.order_id = pfg.order_id   where pf.order_sn > (floor(rand()*329004) + 144395) limit 100");
//

		count=list.size();
	}
	private static Connection getConn1() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rr-2ze2q2z46xr9970z9.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {

			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private static Connection getConn2() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rr-2ze29bj945gii52iw.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver); //classLoader
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	private static Connection getConn3() {

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rr-2zeyu83v3pedfi6z0.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	private static Connection getConn4() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rr-2zey996x50941yuqt.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver); //classLoader,���ض�Ӧ����
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private static Connection getConn5() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://rr-2ze6eox990066921p.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	//	低速的SLB
	private static Connection getConnSLB() {

		String url = "jdbc:mysql://rm-2zedb141603k6dc8frw.mysql.rds.aliyuncs.com:3306/shopnc_181123";
		String username = "dbproxy";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	private static Connection getConnselect() {
		//阿里
//		String url = "jdbc:mysql://rm-2zedb141603k6dc8f5o.mysql.rds.aliyuncs.com:3306/shopnc_181123";
//		String username = "dbproxy";
//		String password = "Jybd2018$!";
//		Connection conn = null;
		//腾讯
		String url = "jdbc:mysql://cd-cdb-99lkyk9u.sql.tencentcdb.com:63420/shopnc_test";
		String username = "root";
		String password = "Jybd2018$!";
		Connection conn = null;
		try {
			//Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static List select1() throws Exception {
		Connection conn = getConn1();

		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql = (String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));

				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}
	public static List select2() throws Exception {
		Connection conn = getConn2();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql =(String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));

				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}
	public static List select3() throws Exception {
		Connection conn = getConn3();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql =(String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));

				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}
	public static List select4() throws Exception {
		Connection conn = getConn4();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql =(String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));

				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}

	public static List select5() throws Exception {
		Connection conn = getConn5();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql =(String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));

				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}

	public static List selectSLB() throws Exception {
		Connection conn = getConnSLB();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";
		int q=(int) (Math.random()*count);
		String sql =(String) list.get(q);
		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}
	public static List selectbysql(String sql) throws Exception {
		Connection conn = getConnselect();
		//String sql = "SELECT * FROM `shopnc_pf_orders` pf_orders WHERE ( pf_orders.buyer_phone LIKE '%15034882534%' ) AND ( pf_orders.is_groupon = '0' ) AND ( pf_orders.order_type <> '5' ) AND ( pf_orders.qdt_type = '0' ) ORDER BY order_id desc LIMIT 0,15";

		List list =new ArrayList();
		PreparedStatement pstmt = null;
		try {
			pstmt = (PreparedStatement)conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData sMetadata =rs.getMetaData();
			int col = sMetadata.getColumnCount();

			while (rs.next()) {
				Map map=new HashMap();
				for (int i = 1; i <= col; i++) {
					map.put(sMetadata.getColumnLabel(i),rs.getObject(i));
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			pstmt.close();
			conn.close();
		}

		return list;
	}
	public static void main(String[] args) throws Exception {
		String sql="SELECT\n" +
				"	shopnc_mb_user_token.token\n" +
				"FROM\n" +
				"	shopnc_mb_user_token\n" +
				"INNER JOIN shopnc_member ON shopnc_member.member_id = shopnc_mb_user_token.member_id\n" +
				"WHERE\n" +
				"	client_type = 'manbang'\n" +
				"LIMIT 100;";
		List lista=selectbysql(sql);
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("list.add(\""+((Map)lista.get(i)).get("token")+"\");");
			//System.out.println(lista.get(i));
		}
		System.out.println(lista.size());

	}

}

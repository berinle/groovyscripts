@Grapes([	@Grab(group='net.sourceforge.jtds', module='jtds', version='1.2'),	@GrabConfig(systemClassLoader=true)])import groovy.sql.Sql;username = args[0]password = args[1]def sql = Sql.newInstance("jdbc:jtds:sybase://santee:2025;DatabaseName=auctions", username, password, "net.sourceforge.jtds.jdbc.Driver")println "done connecting..."println sql.connection.dump()bldr = new groovy.xml.MarkupBuilder()bldr.auctions {	/*sql.eachRow "select * from auction", {		auction(auction_id: it.auction_id,			auction_desc: it.auction_desc,			auction_item_summary: it.auction_item_summary,			bureau_code: it.bureau_code,			mb_service_code: it.mb_service_code,			filing_window_ind: it.filing_window_ind,			gis_ind: it.gis_ind,			lockbox_num: it.lockbox_num,			payment_type_code: it.payment_type_code,			upfront_payment_factor: it.upfront_payment_factor,			upfront_default_factor: it.upfront_default_factor,			upfront_due_date: it.upfront_due_date,			public_live_date: it.public_live_date,			public_mock_date: it.public_mock_date,			seminar_date: it.seminar_date,			auction_start_date: it.auction_start_date,			auction_end_date: it.auction_end_date,			agg_reserve_price: it.agg_reserve_price,			item_filter_ind: it.item_filter_ind,			bid_pref_ind: it.bid_pref_ind,			auto_ann_ind: it.auto_ann_ind,			auto_verify_ind: it.auto_verify_ind,			enable_175submit_ind: it.enable_175submit_ind,			enable_175search_ind: it.enable_175search_ind,			enable_bidding_ind: it.enable_bidding_ind,			enable_au_ind: it.enable_au_ind,			coord_datum: it.coord_datum,			current_phase: it.current_phase,			live_auction_id: it.live_auction_id,			auction_mode: it.auction_mode,			default_pay_penalty: it.default_pay_penalty,			withdrawal_pay_penalty: it.withdrawal_pay_penalty,			addl_pay_due_date: it.addl_pay_due_date,			final_pay_due_date: it.final_pay_due_date,			process_type: it.process_type,			down_payment_pct: it.down_payment_pct,			auction_view: it.auction_view,			limit_bidding_ind: it.limit_bidding_ind,			limit_175search_ind: it.limit_175search_ind,			) 	}*/		sql.eachRow "select * from auction", {		//auction(auction_id: it.auction_id){ 			//println "${it}"				auction(id:it.auction_id){			auction_desc(it.auction_desc)				}									//auction_desc( a.auction_desc )			/*auction_item_summary(  it.auction_item_summary)			bureau_code(  it.bureau_code)			mb_service_code(  it.mb_service_code)			filing_window_ind(  it.filing_window_ind)			gis_ind(  it.gis_ind)			lockbox_num(  it.lockbox_num)			payment_type_code(  it.payment_type_code)			upfront_payment_factor(  it.upfront_payment_factor)			upfront_default_factor(  it.upfront_default_factor)			upfront_due_date(  it.upfront_due_date)			public_live_date(  it.public_live_date)			public_mock_date(  it.public_mock_date)			seminar_date(  it.seminar_date)			auction_start_date(  it.auction_start_date)			auction_end_date(  it.auction_end_date)			agg_reserve_price(  it.agg_reserve_price)			item_filter_ind(  it.item_filter_ind)			bid_pref_ind(  it.bid_pref_ind)			auto_ann_ind(  it.auto_ann_ind)			auto_verify_ind(  it.auto_verify_ind)			enable_175submit_ind(  it.enable_175submit_ind)			enable_175search_ind(  it.enable_175search_ind)			enable_bidding_ind(  it.enable_bidding_ind)			enable_au_ind(  it.enable_au_ind)			coord_datum(  it.coord_datum)			current_phase(  it.current_phase)			live_auction_id(  it.live_auction_id)			auction_mode(  it.auction_mode)			default_pay_penalty(  it.default_pay_penalty)			withdrawal_pay_penalty(  it.withdrawal_pay_penalty)			addl_pay_due_date(  it.addl_pay_due_date)			final_pay_due_date(  it.final_pay_due_date)			process_type(  it.process_type)			down_payment_pct(  it.down_payment_pct)			auction_view(  it.auction_view)			limit_bidding_ind(  it.limit_bidding_ind)			limit_175search_ind(  it.limit_175search_ind)*/		//}	}			}
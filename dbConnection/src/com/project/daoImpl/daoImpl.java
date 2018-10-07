package com.project.daoImpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.dao.dao;
import com.project.model.childModel;
import com.project.model.countryModel;
import com.project.model.firstModel;
import com.project.model.masterModel;
import com.project.model.secondModle;
import com.project.model.thirdModel;
import com.project.model.userModel;
import com.project.util.util;
import com.project.utilImpl.utilImpl;

public class daoImpl implements dao {

	util u = new utilImpl();
	private boolean flag = false;
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	private PreparedStatement ps = null;
	private CallableStatement cs = null;
	/*
	 * public boolean insert(countryModel m) { try { con = u.getConnection();
	 * if(con != null) { ps =
	 * con.prepareStatement("insert into web_country(cname) values(?)");
	 * ps.setString(1,m.getCname());
	 * 
	 * flag = ps.execute();
	 * 
	 * System.out.println("dfghj0=="+flag); } else{
	 * System.out.println("connection kharabai!!"); } } catch (SQLException e) {
	 * System.out.println(e); System.out.println("data store problem!!"); }
	 * return flag; }
	 * 
	 */

	public boolean insert(countryModel m) {
		try {
			con = u.getConnection();
			if (con != null) {
				cs = con.prepareCall("{call country_store(?,?,?)}");
				cs.setString(1, m.getCname());
				cs.setInt(2,m.getCreated_by_id());
				cs.setString(3,m.getCreated_mac());

				flag = cs.execute();

				System.out.println("dfghj0==" + flag);
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean insert(userModel m) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("insert into web_user(fname,number,bdate,gender,cid,address,hobbi) values('"
						+ m.getFname() + "','" + m.getNumber() + "','" + m.getDc() + "','" + m.getGender() + "','"
						+ m.getCountry() + "','" + m.getAddress() + "','" + m.getHobbi() + "')");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean delete(int id) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("delete from web_user where user_id='" + id + "'");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean deletep(int id) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("update web_user set active_flag = '1' where user_id='" + id + "'");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean deletee(int id) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("update web_user set active_flag = '0' where user_id='" + id + "'");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean insert(firstModel m) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("insert into web_first(fname) values('" + m.getFname() + "')");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean insert(secondModle m) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate(
						"insert into web_second(fid,email) values('" + m.getFid() + "','" + m.getEmail() + "')");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean insert(masterModel m) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate("insert into web_master(fname,number,gender,country,address) values('"
						+ m.getFname() + "','" + m.getNumber() + "','" + m.getGender() + "','" + m.getCountry() + "','"
						+ m.getAddress() + "')");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public boolean insert(childModel m) {
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				int u = st.executeUpdate(
						"insert into web_child(mas_id,hobbi) values('" + m.getMas_id() + "','" + m.getHobbi() + "')");
				if (u > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return flag;
	}

	public ArrayList<countryModel> views() {
		ArrayList<countryModel> lm = new ArrayList<countryModel>();
		try {
			countryModel m = null;
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select u.fname,c.cid,c.cname,c.created_by_date,c.created_mac from web_country c INNER JOIN web_user u ON u.user_id = c.created_by_id");
				if (rs != null) {
					while (rs.next()) {
						m = new countryModel(rs.getByte("cid"), rs.getString("cname"),rs.getString("fname"),rs.getDate("created_by_date"),rs.getString("created_mac"));
						lm.add(m);
					}
				} else {
					System.out.println("data khali 6!!");
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return lm;
	}

	public ArrayList<userModel> view() {
		ArrayList<userModel> lm = new ArrayList<userModel>();
		try {
			userModel m = null;
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select * from web_user");
				if (rs != null) {
					while (rs.next()) {
						m = new userModel(rs.getInt("user_id"), rs.getString("fname"), rs.getLong("number"),
								rs.getString("gender"), rs.getByte("cid"), rs.getString("address"),
								rs.getString("hobbi"), rs.getByte("active_flag"));
						lm.add(m);
					}
				} else {
					System.out.println("data khali 6!!");
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return lm;
	}

	public ArrayList<userModel> viewe() {
		ArrayList<userModel> lm = new ArrayList<userModel>();
		try {
			userModel m = null;
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select * from web_user where active_flag = '0'");
				if (rs != null) {
					while (rs.next()) {
						m = new userModel(rs.getInt("user_id"), rs.getString("fname"), rs.getLong("number"),
								rs.getString("gender"), rs.getByte("cid"), rs.getString("address"),
								rs.getString("hobbi"), rs.getByte("active_flag"));
						lm.add(m);
					}
				} else {
					System.out.println("data khali 6!!");
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return lm;
	}

	public int getId() {
		int yu = 0;
		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select MAX(mas_id) AS id from web_master");
				if (rs != null) {
					if (rs.next()) {
						yu = rs.getInt("id");
					}
				} else {
					System.out.println("data khali 6!!");
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return yu;
	}


	@Override
	public ArrayList check(userModel h) {
		ArrayList l = new ArrayList();

		userModel m = null;

		try {
			con = u.getConnection();
			if (con != null) {
				st = con.createStatement();
				rs = st.executeQuery("select user_id from web_user where fname = '" + h.getFname() + "'");
				
				if (rs.next()) {

					
					rs = st.executeQuery("select user_id from web_user where fname = '" + h.getFname()
							+ "' and number = '" + h.getNumber() + "'");
					if (rs.next()) {
						rs = st.executeQuery("select user_id,fname from web_user where fname = '" + h.getFname()
								+ "' and number = '" + h.getNumber() + "' and active_flag = '0'");
						
							if (rs.next()) {

								m = new userModel(rs.getInt("user_id"), rs.getString("fname"));
                                l.add("ws");
                                l.add(m);
							}
						 else {
							l.add("wb");
						
						}

					} else {
						l.add("wp");
						

					}

				} else {
					
					l.add("wu");
				
				}
			} else {
				System.out.println("connection kharabai!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
			System.out.println("data store problem!!");
		}
		return l;
	}

	@Override
	public boolean insert(thirdModel m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getIds() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getIdd() {
		// TODO Auto-generated method stub
		return 0;
	}

}

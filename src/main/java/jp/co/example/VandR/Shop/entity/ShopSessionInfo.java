package jp.co.example.VandR.Shop.entity;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/*
 * セッション情報管理用クラス
 */
@Component
@Scope(value= "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShopSessionInfo implements Serializable {
	private static final long serialVersionUID = 6334063099671792256L;

	private int user_id;
	private int shop_id;

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
}

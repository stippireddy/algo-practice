package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode022 {

  public static void main(String[] args) {
    LeetCode022 l = new LeetCode022();
    System.out.println(l.generateParenthesis(3));
  }

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    helper(result, n, 0, new StringBuilder());
    return result;
  }

  private void helper(List<String> result, int n, int left, StringBuilder subResult) {
    if (n == 0 && left == 0) {
      result.add(subResult.toString());
      return;
    }
    if (n > 0) {
      int size = subResult.length();
      helper(result, n - 1, left + 1, subResult.append('('));
      subResult.setLength(size);
    }
    if (left > 0) {
      int size = subResult.length();
      helper(result, n, left - 1, subResult.append(')'));
      subResult.setLength(size);
    }
  }
}
/*

{
    payment: {
    billing_common_risk_data: {
    billing_customer: {
    customer_number: 932308216966,
    creation_time_millis: 1587203895602,
    legal_address: {
    country_name_code: "SG",
    administrative_area_name: ""
    },
    last_changed_legal_address_time_millis: 1587203895602,
    creator_user: {

    },
    accessible_user:       [{
    role:         [ROLE_ADMIN],
    verification_status: "USER_VERIFICATION_STATUS_ACCEPTED",
    last_modified_time: 1587203896104471,
    creation_time: 1587203896104471
    }],
    used_billable_service:       [70320]
    },
    user_in_session: {
    login_time_millis: 0,
    ip_address: "132.147.118.74"
    },
    device: {
    device_fingerprinting: {
    parsed: {
    properties: {
    operating_system: "ANDROID",
    imei: "866402042123795",
    device_name: "HWELE",
    product_name: "ELE-L29",
    model_name: "ELE-L29",
    manufacturer: "HUAWEI",
    build_fingerprint: "HUAWEI/ELE-L29/HWELE:10/HUAWEIELE-L29/10.0.0.190C636:user/release-keys",
    os_version: "10",
    android_build_brand: "HUAWEI",
    serial_number: "53F0219422003019"
    },
    state: {
    installed_packages:             [{
    name: "com.google.android.gms",
    version_code: "201516039",
    last_update_time: 1588842723876,
    first_install_time: 1533657660000,
    install_location: "/data/app/com.google.android.gms-Q1bgT_eQi9Xn2K5nB91_Tg==/base.apk"
    },{
    name: "com.google.android.apps.nbu.paisa.user",
    version_code: "2052141",
    last_update_time: 1588842852358,
    first_install_time: 1587052070524,
    install_location: "/data/app/com.google.android.apps.nbu.paisa.user-yl7rU8tBXpIVUvKbOD0RMQ==/base.apk"
    }],
    percent_battery: 66,
    gmt_offset_millis: 28800000,
    last_gps_location: {
    altitude: 19,
    latitude: 1.3090041,
    longitude: 103.9031831,
    accuracy: 15.611,
    time_in_ms: 1589759313230
    },
    dev_mode_on: false,
    non_play_install_allowed: true,
    language: "eng",
    locale_language: "en",
    ip_addr:             [fe80::8e9:ccff:fe08:ccbe%dummy0,fe80::6aa0:3eff:fe5f:2041%wlan0,192.168.2.185,fe80::5a02:3ff:fe04:50d%rmnet_ims00,2400:1c00:c9:6c7:3972:6cb5:27f2:7cd2,10.108.43.245,fe80::68a0:3eff:fe5f:2041%p2p0],
    locale: "en_GB",
    locale_country: "GB",
    cell_operator: "52501",
    sim_operator: "52501",
    phone_type: 1,
    device_uptime_millis: 256143093,
    timezone_name: "Singapore Standard Time",
    available_gaia_accounts_count: 1
    }
    }
    },
    device_type: "DEVICE_TYPE_MOBILE"
    },
    product_context: {
    billable_services:       [70098]
    }
    },
    billing_payment_risk_data: {
    payment_risk_check_wait_allowed: false,
    required_funds: {
    amount: {
    currency_code: "SGD"
    },
    instrument: {
    creation_time_millis: 1587204166468,
    instrument2: {

    }
    }
    },
    moneyflow_type: "MONEYFLOW_TYPE_EXTERNAL"
    },
    product_payment_risk_data: {
    transaction: {
    creation_time_millis: 1589759685979
    },
    p2p_payment_risk_data: {
    sender_user:       [{

    }],
    recipient:       [{

    }]
    }
    },
    risk_metadata: {
    event_id: {
    time_usec: 1589759686150162,
    server_ip: 175332594,
    process_id: 1979993771
    },
    processing_stack: "V2"
    }
    },
    risk_metadata: {
    event_id: {
    time_usec: 1589759686150162,
    server_ip: 175332594,
    process_id: 1979993771
    },
    processing_stack: "V2"
    }
    }

    */
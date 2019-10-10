package com.sirun.loginmodules.http;


import com.sirun.httputil.BaseNetServiceRepository;

/**
 * @author xueqiaoming
 * @date 2018/12/29 10:08
 * @describe
 */
public class NetServiceRepository extends BaseNetServiceRepository<NetService> {

   private static NetServiceRepository instance;

    private NetServiceRepository() {
    }

    /**
     * 单例模式
     *
     * @return 本类的对象
     */
    public static synchronized NetServiceRepository getInstance() {
        if (instance == null) {
            synchronized (NetServiceRepository.class) {
                if (instance == null) {
                    instance = new NetServiceRepository();
                }
            }
        }
        return instance;
    }

    @Override
    public Class<NetService> setNetService() {
        return NetService.class;
    }

}

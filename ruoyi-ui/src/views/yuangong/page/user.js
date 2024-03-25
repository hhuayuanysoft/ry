import request from '@/utils/request'

// 查询用户列表
export function listNotice(query) {
  return request({
    url: '/yuan-gong/list',
    method: 'get',
    params:query
  })
}

